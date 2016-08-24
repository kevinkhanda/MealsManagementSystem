<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Innopolis - Meal management system</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="css/style.css" >
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
  </head>
  <body>
    <div class="container">
        <div tabindex="-1" class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
          <div class="modal-content">
          <div class="modal-body">
            <div class="form-group">
              <label>Email address</label>
              <div class="input-group">
                <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-user"> </span></span>
                <input type="text" class="form-control" placeholder="Email" aria-describedby="basic-addon1" id="email">
              </div>
            </div>

            <div class="form-group">
              <label for="exampleInputPassword1">Password</label>
              <div class="input-group">
                <span class="input-group-addon" id="basic-addon2"><span class="glyphicon glyphicon-lock"> </span></span>
                <input type="password" class="form-control" id="pass" placeholder="Password" aria-describedby="basic-addon2">
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <a href="" class="forgot">Forgot password?</a>
            <a class="btn btn-success" id="btn-primary" href="main.jsp" role="button">Log In</a>
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
      $(window).resize(function(){
        $('.modal').css({
          position:'absolute',
          left: ($(document).width() - $('.modal').outerWidth())/2,
          top: ($(document).height() - $('.modal').outerHeight())/2
        });
      });
    </script>

    <script type="text/javascript">
      $(window).resize();
    </script>
  </body>
</html>
