<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    <script src="js/bootstrap.min.js"></script>
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
              <li class="active"><a >Main Page<span class="sr-only">(current)</span></a></li>
              <li><a href="/menu">Menu</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="/pubnews">Publish News & Menu</a></li>
                  <li role="separator" class="divider"></li>
                  <li><a href="/userform">Add New User</a></li>
                  <li role="separator" class="divider"></li>
                  <li><a href="/history">Show History</a></li>
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li>
                  <!--тут будет использоваться картинка пользователя -->
                  <div class="col-xs-2 col-sm-2"> <img src="img/user.png" width="40" height="40" class="img-circle userlogo"> </div>
                  <div class="col-xs-10 col-sm-10 username"><a class="man" href="/userhistory">Альберт Сахапов</a></div>  <!-- Здесь будет использоваться имя и фамилия пользователя-->
                  
                  <div class="col-xs-1 col-sm-1 sett"><a href="/settings"><img src="img/settings.png"></a></div>
                  <div class="col-xs-1 col-sm-1 lout"><a href="/logout"><img src="img/logout4.png"></a></div>
                
                
              </li>
            </ul>

          </div><!-- /.navigation bar -->
        </div>
        </nav>

          <div id="page"> <!--main page -->
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">  <!--carousel-->
              <!-- Indicators -->
              <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
              </ol>

              <!-- Wrapper for slides -->
              <div class="carousel-inner" role="listbox">
                <div class="item active">
                  <div class="jumbotron" id="menujumbo">
                    <h1 id="jumbo"> Menu for Today! </h1> <br><br>
                    <p id="jumbo"> Menu for breakfast,  lunch and dinner.   </p>
                    <p id="jumbo"><a class="btn btn-success btn-lg" href="/menu" role="button">Look Through!</a></p>
                  </div>
                </div>
                <div class="item">
                    <div class="jumbotron" id="planjumbo">
                      <h1 id="jumbo">Choose the Plan!</h1> <br><br>
                      <p id="jumbo">Choose your Meal Plan for the next month.</p>
                      <p id="jumbo"><a class="btn btn-success btn-lg" href="/settings" role="button">Choose!</a></p>
                    </div>
                </div>
              </div>

              <!-- Controls -->
              <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
              </a>
              <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
              </a>
            </div> <!-- end carousel -->

            <hr class="line">
            <h1 class="newshead">News</h1> <!--Here comes the news -->
            <br>
            <!-- Each news in one block. I will create a form to post news  (for admins). News will be posted in that style (using backend).-->


            <div class="newsblock"> <!-- This block contains only ONE post (it's large, because of mobile version)-->
              <div class="row"> 

                <div class="col-xs-12 col-sm-4 col-md-5 col-lg-4 imgblock">
                  <img src="img/test.jpg" height="200" width="300" class="img-rounded hidden-xs hidden-sm">
                  <img src="img/test.jpg" height="100" width="150" class="img-rounded hidden-md hidden-lg">
                </div>
                <div class=" col-xs-12 col-sm-8 col-md-7 col-lg-8 headblock">
                    Wow! It's a news template. It's just a test.
                </div> 
                <div class="col-xs-12 col-sm-8 col-md-7 col-lg-8 textblock">
                    Here is a text. Here will be posted something great... or not great. It's just a test. I need more words to test my template. Okay, Desktop design looked like a piece of ... on mobile phone. So, Mobile version of website has another version.
                </div> 

              </div>
              <hr class="line">
            </div> <!-- End of newsblock -->

            <div class="newsblock"> <!-- This block contains only ONE post (it's large, because of mobile version)-->
              <div class="row"> 

                <div class="col-xs-12 col-sm-4 col-md-5 col-lg-4 imgblock">
                  <img src="img/test.jpg" height="200" width="300" class="img-rounded hidden-xs hidden-sm">
                  <img src="img/test.jpg" height="100" width="150" class="img-rounded hidden-md hidden-lg">
                </div>
                <div class=" col-xs-12 col-sm-8 col-md-7 col-lg-8 headblock">
                    Wow! The second post. 
                </div> 
                <div class="col-xs-12 col-sm-8 col-md-7 col-lg-8 textblock">
                    I'm testing... again. Some new information. Good news. Bad news. bla-bla-bla-bla
                </div> 

              </div>
              <hr class="line">
            </div> <!-- End of newsblock -->

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
    setTimeout('$("#myModal").modal("show")', 1200)
    </script>

    <script type="text/javascript">
    $(window).resize();
    </script>

  </body>
</html>
