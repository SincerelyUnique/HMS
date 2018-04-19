
function saveAdd() {

    var username = $("#username").val();
    var password = $("#password").val();
    var userRole = $("#userRole").val();
    var enable = $("#enable").val();
    var email = $("#email").val();
    var telephone = $("#telephone").val();
    var remark = $("#remark").val();

    var param = {
        username:username,
        password:password,
        userRole:userRole,
        enable:enable,
        email:email,
        telephone:telephone,
        remark:remark
    };

    $.ajax({
        url : ctx+'/user/saveAdd',
        async : true,
        type: 'POST',
        contentType : 'application/json',
        data: JSON.stringify(param),
        success : function(data) {
            parent.location.reload();
            closeSelf();
        },
        error:function (data) {
            layer.msg("操作失败");
            parent.location.reload();
            closeSelf();
        }
    });
}