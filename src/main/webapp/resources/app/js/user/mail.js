
$(function(){

});

/**
 * 发送邮件
 */
function sendEmail() {

    var senderAddress = $("#senderAddress").val();
    var recipientAddress = $("#recipientAddress").val();
    var subject = $("#subject").val();
    var message = $("#message").val();

    var emailVo = {
        senderAddress : senderAddress,
        recipientAddress : recipientAddress,
        subject : subject,
        message : message
    };

    $.ajax({
        url : ctx+'/user/sendEmail',
        async : true,
        type: 'POST',
        contentType : 'application/json',
        data: JSON.stringify(emailVo),
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

/**
 * 关闭弹窗
 */
function closeSelf(){
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
}

