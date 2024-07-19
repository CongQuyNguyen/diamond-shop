<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="span12">
    <ul class="breadcrumb">
        <li><a href="index.html">Home</a> <span class="divider">/</span></li>
        <li class="active">Login</li>
    </ul>
    <h3> Login</h3>
    <hr class="soft"/>

    <div class="row">
        <div class="span5">
            <div class="well">
                <h5>CREATE YOUR ACCOUNT</h5><br/>
                Enter your e-mail address to create an account.<br/><br/><br/>
                <form>
                    <div class="control-group">
                        <label class="control-label" for="inputEmail">E-mail address</label>
                        <div class="controls">
                            <input class="span4"  type="text" placeholder="Email">
                        </div>
                    </div>
                    <div class="controls">
                        <button type="submit" class="btn block">Create Your Account</button>
                    </div>
                </form>
            </div>
        </div>
        <div class="span2"> &nbsp;</div>
        <div class="span5">
            <div class="well">
                <h5>ALREADY REGISTERED ?</h5>
                <form>
                    <div class="control-group">
                        <label class="control-label" for="inputEmail">Email</label>
                        <div class="controls">
                            <input class="span4"  type="text" placeholder="Email">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputPassword">Password</label>
                        <div class="controls">
                            <input type="password" class="span4" placeholder="Password">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <button type="submit" class="defaultBtn">Sign in</button>
                            <a href="#">Forget password?</a>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>
</body>
</html>
