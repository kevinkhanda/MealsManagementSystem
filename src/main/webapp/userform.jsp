<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Inno project</title>
  <!-- Bootstrap -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="css/style.css" >
  <script src="js/jquery.min.js" type="text/javascript"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.maskedinput.min.js"></script>
</head>
<body>
<div class="container">
  <div id="main">
    <nav class="navbar navbar-default navbar-fixed-top">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navcont">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar" id="ic"></span>
            <span class="icon-bar" id="ic"></span>
            <span class="icon-bar" id="ic"></span>
          </button>
          <a class="navbar-brand"><img id="logo" src="img/innopolislogo.png" width="21" height="28"></a>
        </div>

        <!-- navigation bar -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li><a href="main.jsp">Main Page<span class="sr-only">(current)</span></a></li>
            <li><a href="menu.jsp">Menu</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="pubnews.jsp">Publish News & Menu</a></li>
                <li role="separator" class="divider"></li>
                <li class="active"><a>Add New User</a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li>
              <!--тут будет использоваться картинка пользователя -->
              <div class="col-xs-2 col-sm-2"> <img src="img/user.png" width="40" height="40" class="img-circle userlogo"> </div>
              <div class="col-xs-10 col-sm-10 username">Альберт Сахапов</div>  <!-- Здесь будет использоваться имя и фамилия пользователя-->

              <div class="col-xs-1 col-sm-1 sett"><a href="settings.jsp"><img src="img/settings.png"></a></div>
              <div class="col-xs-1 col-sm-1 lout"><a href="#"><img src="img/logout4.png"></a></div>


            </li>
          </ul>

        </div><!-- /.navigation bar -->
      </div>
    </nav>

    <div id="page">
      <div class="row usrow">
        <div class="headus">
          Add New User
        </div>

        <form class="form-horizontal">
          <br>
          <br>
          <div class="form-group">
            <label for="inputEmail3" class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Last Name</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="text" class="form-control" id="inputEmail3" placeholder="Last Name" required>
            </div>
          </div>
          <div class="form-group">
            <label for="inputEmail3" class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">First Name</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="text" class="form-control" id="inputEmail3" placeholder="First Name" required>
            </div>
          </div>

          <div class="form-group">
            <label for="inputEmail3" class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Patronymic</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="text" class="form-control" id="inputEmail3" placeholder="Patronymic" required>
            </div>
          </div>

          <br>
          <br>
          <hr class="usline col-sm-offset-2 col-lg-offset-1 col-md-offset-1">
          <br>
          <br>

          <div class="form-group">
            <label for="inputEmail3" class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Email</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="email" class="form-control" id="inputEmail3" placeholder="Email" required>
            </div>
          </div>


          <div class="form-group">
            <label for="inputEmail3" class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Oragnization</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="text" class="form-control" id="inputEmail3" placeholder="Organization">
            </div>
          </div>

          <div class="form-group">
            <label for="phone" class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Phone Number</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="text" class="form-control" id="phone" placeholder="Phone Number">
            </div>
          </div>

          <br>
          <br>
          <hr class="usline col-sm-offset-2 col-lg-offset-1 col-md-offset-1">
          <br>
          <br>

          <div class="form-group">
            <label class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Login</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="text" class="form-control" placeholder="Login">
            </div>
          </div>

          <div class="form-group">
            <label class="hidden-xs col-sm-3 col-md-2 col-lg-2 control-label">Temporary Password</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <input type="password" class="form-control" placeholder="Temporary Password">
            </div>
          </div>

          <br>
          <br>
          <hr class="usline col-sm-offset-2 col-lg-offset-1 col-md-offset-1">
          <br>
          <br>

          <div class="form-group">
            <label class="col-xs-12 col-sm-3 col-md-2 col-lg-2 control-label">Role</label>
            <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5">
              <select class="form-control">
                <option>Student</option>
                <option>Employee</option>
                <option>Operator</option>
                <option>Admin</option>
              </select>
            </div>
          </div>

          <br>
          <br>
          <hr class="usline col-sm-offset-2 col-lg-offset-1 col-md-offset-1">
          <br>
          <br>

          <div class="form-group">
            <label class="col-xs-12 col-sm-3 col-md-2 col-lg-2 control-label">Available Terminals</label>

            <form>
              <div class="form-group col-xs-8 col-sm-2 col-md-1 col-lg-1 jp">
                <input type="checkbox" id="check1" name="cc"/>
                <label for="check1"><span></span>1</label>
              </div>
              <div class="form-group col-xs-8 col-sm-2 col-md-1 col-lg-1 jp">
                <input type="checkbox" id="check2" name="cc" />
                <label for="check2"><span></span>2</label>
              </div>
              <div class="form-group col-xs-8 col-sm-2 col-md-1 col-lg-1 jp">
                <input type="checkbox" id="check3" name="cc" />
                <label for="check3"><span></span>3</label>
              </div>
              <div class="form-group col-xs-8 col-sm-5 col-md-1 col-lg-1 jp">
                <input type="checkbox" id="check4" name="cc" />
                <label for="check4"><span></span>4</label>
              </div>
              <div class="form-group col-xs-8 col-sm-2 col-md-1 col-lg-1 jp">
                <input type="checkbox" id="check5" name="cc" />
                <label for="check5"><span></span>5</label>
              </div>
              <div class="form-group col-xs-8 col-sm-2 col-md-1 col-lg-1 jp">
                <input type="checkbox" id="check6" name="cc" />
                <label for="check6"><span></span>6</label>
              </div>
            </form>
          </div>

          <br>
          <br>
          <hr class="usline col-sm-offset-2 col-lg-offset-1 col-md-offset-1">
          <br>
          <br>

          <div class="form-group col-sm-offset-3 col-md-offset-2 col-lg-offset-2 butmob">
            <button type="button" class="btn btn-success usbut">Add</button>
          </div>

        </form>
      </div> <!-- row-->

      <br>
      <br>


    </div> <!-- page-->

  </div> <!-- main -->

</div> <!-- container -->



<a href="#" id="scrollup"> </a>

<script type="text/javascript">
  $(document).ready(function(){
    $(window).scroll(function(){
      if ($(this).scrollTop() > 100) {
        $('#scrollup').fadeIn();
      } else {
        $('#scrollup').fadeOut();
      }
    });
    $('#scrollup').click(function(){
      $("html, body").animate({ scrollTop: 0 }, 600);
      return false;
    });
  });
</script>

<script type="text/javascript">
  jQuery(function($){
    $("#phone").mask("+7 (999) 999-9999");
  });
</script>



</body>
</html>
