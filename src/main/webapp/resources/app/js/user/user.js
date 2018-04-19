
$(function(){
    initEvent();
    //加载表格
    viewInitializer.initData(1);
});

/**
 * 页面初始化器
 * @type {{initData: viewInitializer.initData, initPage: viewInitializer.initPage}}
 */
var viewInitializer ={
    initData: function(pageIndex) {
        var pageSize = 10;//默认每页10条记录
        var param = {
            pageNum:pageIndex,//当前页号
            numPerPage:pageSize//每页条数
        };
        $.ajax({
            url:ctx+'/user/list',
            data:param,
            type:'POST',
            dataType:'JSON',
            success:function (data) {
                var listTable = $("#list_table");
                listTable.empty();
                listTable.html(template('list-tmpl', data));
                viewInitializer.initPage(data.total, pageIndex, pageSize);
            }
        })

    },
    //加载分页
    initPage: function(total, currentPage, pageSize) {
        $("#pageFoot").pagination({
            items: total,
            itemsOnPage: pageSize,
            currentPage: currentPage,
            cssStyle: 'common-page',
            onPageClick: function (pageIndex) {
                viewInitializer.initData(pageIndex);
            }
        }).append('<div class="total">每页'+pageSize+'条数据，共'+total+'条数据！</div>');
    }
};

/**
 * 添加
 */
var initEvent= function(){
    $('#add').on('click', function () {
        layer.open({
            type: 2,
            title: '新增',
            shadeClose: true,
            shde: .8,
            area: ['550px', '380px'],
            content:ctx+'/user/add'
        });
    });
};

/**
 * 编辑
 * @param id 数据id
 */
function edit(id) {
    layer.open({
        type: 2,
        title: '编辑',
        shadeClose: true,
        shde: .8,
        area: ['550px', '380px'],
        content:ctx+'/user/edit?id='+id
    });
}

/**
 * 删除
 * @param id 数据id
 */
function deleteItem(id) {
    layui.use(['layer'], function () {
        layer.open({
            title: '提示',
            content: '确认删除此配置？',
            btn: ['确认', '取消'],
            shadeClose: false,
            yes: function () {
                $.ajax({
                    url:ctx+'/user/delete?id='+id,
                    type: "GET",
                    success:function (data) {
                        if (data.content === -1){
                            console.info("此数据已被绑定，请先解除绑定关系");
                            layer.open({
                                title: '提示',
                                content: '此配置正在使用中，请先解除绑定关系',
                                btn: ['确认'],
                                shadeClose: false,
                                yes: function () {
                                    location.reload();
                                }
                            });
                        }else{
                            location.reload();
                        }
                    },
                    error : function(XMLHttpRequest, textStatus, errorThrown) {
                        layer.msg("删除失败");
                        location.reload();
                    }
                })
            }
        });
    });
}

/**
 * 发邮件弹出层
 * @param id
 */
function email( id ) {
    layer.open({
        type: 2,
        title: '编辑邮件信息',
        shadeClose: true,
        shde: .8,
        area: ['550px', '400px'],
        content:ctx+'/user/mail?id='+id
    });
}

