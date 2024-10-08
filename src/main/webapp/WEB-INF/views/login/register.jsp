<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/19/2024
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<div class="span12">
    <ul class="breadcrumb">
        <li><a href="index.html">Home</a> <span class="divider">/</span></li>
        <li class="active">Registration</li>
    </ul>
    <h3> Registration</h3>
    <hr class="soft"/>
    <div class="well">
        <form class="form-horizontal">
            <h3>Your Personal Details</h3>
            <div class="control-group">
                <label class="control-label">Title <sup>*</sup></label>
                <div class="controls">
                    <select class="span1" name="days">
                        <option value="">-</option>
                        <option value="1">Mr.</option>
                        <option value="2">Mrs</option>
                        <option value="3">Miss</option>
                    </select>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputFname">First name <sup>*</sup></label>
                <div class="controls">
                    <input type="text" id="inputFname" placeholder="First Name">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputLname">Last name <sup>*</sup></label>
                <div class="controls">
                    <input type="text" id="inputLname" placeholder="Last Name">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email <sup>*</sup></label>
                <div class="controls">
                    <input type="text" placeholder="Email">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Password <sup>*</sup></label>
                <div class="controls">
                    <input type="password" placeholder="Password">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Date of Birth <sup>*</sup></label>
                <div class="controls">
                    <select class="span1" name="days">
                        <option value="">-</option>
                        <option value="1">1&nbsp;&nbsp;</option>
                        <option value="2">2&nbsp;&nbsp;</option>
                        <option value="3">3&nbsp;&nbsp;</option>
                        <option value="4">4&nbsp;&nbsp;</option>
                        <option value="5">5&nbsp;&nbsp;</option>
                        <option value="6">6&nbsp;&nbsp;</option>
                        <option value="7">7&nbsp;&nbsp;</option>
                    </select>
                    <select class="span1" name="days">
                        <option value="">-</option>
                        <option value="1">1&nbsp;&nbsp;</option>
                        <option value="2">2&nbsp;&nbsp;</option>
                        <option value="3">3&nbsp;&nbsp;</option>
                        <option value="4">4&nbsp;&nbsp;</option>
                        <option value="5">5&nbsp;&nbsp;</option>
                        <option value="6">6&nbsp;&nbsp;</option>
                        <option value="7">7&nbsp;&nbsp;</option>
                    </select>
                    <select class="span1" name="days">
                        <option value="">-</option>
                        <option value="1">1&nbsp;&nbsp;</option>
                        <option value="2">2&nbsp;&nbsp;</option>
                        <option value="3">3&nbsp;&nbsp;</option>
                        <option value="4">4&nbsp;&nbsp;</option>
                        <option value="5">5&nbsp;&nbsp;</option>
                        <option value="6">6&nbsp;&nbsp;</option>
                        <option value="7">7&nbsp;&nbsp;</option>
                    </select>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <input type="submit" name="submitAccount" value="Register" class="exclusive shopBtn">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
