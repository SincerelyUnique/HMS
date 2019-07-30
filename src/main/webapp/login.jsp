<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/app/css/lrtk.css">
    <link href="<%=request.getContextPath()%>/resources/app/images/home.ico" rel="shortcut icon" />
</head>
<body style="background-color: #34b125">
<div id="login">
    <div class="wrapper" style="background-color: #37A3CF">
        <div class="login">
            <form action="<%=request.getContextPath()%>/login" method="post" class="container offset1 loginform">

                <div id="owl-login">
                    <div class="hand"></div>
                    <div class="hand hand-r"></div>
                    <div class="arms">
                        <div class="arm"></div>
                        <div class="arm arm-r"></div>
                    </div>
                </div>
                <div class="pad">
                    <input type="hidden" name="_csrf" value="9IAtUxV2CatyxHiK2LxzOsT6wtBE6h8BpzOmk=">
                    <div class="control-group">
                        <div class="controls">
                            <label for="email" class="control-label fa fa-envelope"></label>
                            <input id="email" name="username"  tabindex="1" autofocus="autofocus" class="form-control input-medium">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <label for="password" class="control-label fa fa-asterisk"></label>
                            <input id="password" type="password" name="password" placeholder="Password" tabindex="2" class="form-control input-medium">
                        </div>
                    </div>
                </div>
                <div class="form-actions"><a href="" tabindex="5" class="btn pull-left btn-link text-muted">Forgot password?</a><a href="" tabindex="6" class="btn btn-link text-muted">Sign Up</a>
                    <button type="submit" tabindex="4" class="btn btn-primary">Login</button>
                </div>
            </form>
        </div>
    </div>
    <script src="<%=request.getContextPath()%>/resources/plugins/jquery/jquery-3.2.1.min.js"></script>
    <script>
        $(function() {
            $('#login #password').focus(function() {
                $('#owl-login').addClass('password');
            }).blur(function() {
                $('#owl-login').removeClass('password');
            });
        });
    </script>
</div>

</body>
</html>