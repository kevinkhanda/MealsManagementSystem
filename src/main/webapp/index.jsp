<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Innopolis - Meal management system</title>

    <!-- Bootstrap -->
    <link href="<c:url value="css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
    <link href="<c:url value="css/bootstrap-theme.min.css" />" rel="stylesheet" type="text/css">
    <link href="<c:url value="css/style.css" />" rel="stylesheet" type="text/css">
    <script src="<c:url value="js/jquery.min.js" />" type="text/javascript"></script>
    <script src="<c:url value="js/bootstrap.min.js" />" type="text/javascript"></script>
</head>
<body>

<div class="container">
    <div tabindex="-1" class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
         style="display: none;">
        <c:if test="${param.error ne null}">
            <div style="color:#fff;text-align: center;">
                Invalid username and password
            </div>
        </c:if>
        <c:if test="${param.logout ne null}">
            <div style="color:#fff;text-align: center;">
                 You have been logged out.
            </div>
        </c:if>
        <div class="modal-content">
            <div class="modal-body">

                  
                        
                <form action="/login" method="post">
                    <div class="form-group">
                        <label>Email address</label>
                        <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1"><span
                                class="glyphicon glyphicon-user"> </span></span>
                            <input type="text" name="username" class="form-control" placeholder="Email" aria-describedby="basic-addon1"
                                   id="email">
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="pass">Password</label>
                        <div class="input-group">
                        <span class="input-group-addon" id="basic-addon2"><span
                                class="glyphicon glyphicon-lock"> </span></span>
                            <input type="password" class="form-control" name="password" id="pass" placeholder="Password"
                                   aria-describedby="basic-addon2">
                        </div>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    <hr>
                    <div class="but"><input type="submit" value="Sign In" class="btn btn-success"/></div>

                </form>
            </div>


        </div>
        <div class="modal-body">
            <p>powered by <a href="http://university.innopolis.ru/" id="inn">Innopolis University</a></p>
        </div>
    </div>


    <!--<div class="bs-docs-example" style="padding-bottom: 24px;"><a class="btn btn-primary btn-large" href="#myModal" data-toggle="modal">Запустить демонстрацию модального элемента</a></div>-->
</div>



<script type="text/javascript">
    setTimeout('$("#myModal").modal("show")', 1200)
</script>



<script type="text/javascript">
    $(window).resize(function () {
        $('.modal').css({
            position: 'absolute',
            left: ($(document).width() - $('.modal').outerWidth()) / 2,
            top: ($(document).height() - $('.modal').outerHeight()) / 2
        });
    });
</script>


<script type="text/javascript">
    $(window).resize();
</script>
</body>
</html>