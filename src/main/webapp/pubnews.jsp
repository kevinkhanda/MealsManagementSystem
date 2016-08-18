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
                <li><a href="main.html">Main Page<span class="sr-only">(current)</span></a></li>
                <li><a href="menu.html">Menu</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li class="active"><a>Publish News & Menu</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="userform.html">Add New User</a></li>
                  </ul>
                </li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
                <li>
                  <!--тут будет использоваться картинка пользователя -->
                  <div class="col-xs-2 col-sm-2"> <img src="img/user.png" width="40" height="40" class="img-circle userlogo"> </div> 
                  <div class="col-xs-10 col-sm-10 username">Альберт Сахапов</div>  <!-- Здесь будет использоваться имя и фамилия пользователя--> 
                  
                  <div class="col-xs-1 col-sm-1 sett"><a href="settings.html"><img src="img/settings.png"></a></div> 
                  <div class="col-xs-1 col-sm-1 lout"><a href="index.html"><img src="img/logout4.png"></a></div>
                  
                  
                </li>
              </ul>

            </div><!-- /.navigation bar -->
          </div>
          </nav>

          <div id="page">
            <div class="row">
                
                <form>
                  <div class="headus">
                    Publish News
                  </div>
                  <div class="form-group col-xs-12 col-sm-9 col-md-8 col-lg-9">                    
                    <input type="text" class="form-control" id="inputEmail3" placeholder="Header" required>
                  </div>
                  <!-- PC upload-->
                  <div class="form-group hidden-xs col-sm-3 col-md-4 col-lg-3 photoUp">
                    <label>
                      <input type="file" id="exampleInputFile">
                      <span>Upload Photo</span>
                    </label>
                  </div>
                  <!-- /PC -->
                  <div>
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                      <textarea class="form-control" rows="8" placeholder="Your Text..."></textarea>
                    </div>  
                  </div>
                  <!-- PC publish-->
                  <div class="form-group hidden-xs col-sm-12 col-md-6 col-lg-12 pubbutton pubbtn">
                    <label>
                      <button type="button" class="btn btn-default"></button>
                      <span>Publish</span>
                    </label>
                  </div>
                  <!-- /PC -->

                  <!--Mobile upload and publish-->
                  <div class="form-group hidden-sm hidden-md hidden-lg col-xs-12">
                    <label for="exampleInputFile">Upload Photo</label>
                    <input type="file" id="exampleInputFile">
                  </div>
                  <div class="form-group hidden-sm hidden-md hidden-lg col-xs-12">
                    <button type="button" class="btn btn-success">Publish</button>
                  </div>
                  <!-- /Mobile -->
                </form>

            </div> <!-- row-->


                <br>
                <br>
                <hr class="hidden-xs hidden-sm">
                <br>
                <br>
                <br>



                <form>

                  <div class="headus">
                    Publish Menu
                  </div>

                  <div class="row usrow">
                    <div style="text-align: center;">
                      <input style="text-align: center;" type="text" id="filename" class="filename" disabled>
                    </div>
                    <div style="width:100%;" id="doc" class="form-group docUp file-upload">
                      <label>
                        <input type="file" id="exampleInputFile">
                        <span>Upload Menu (DOC File)</span>
                      </label>
                    </div>
                    <div style="width:100%;" id="pubes" class="form-group pub2">
                      <label>
                        <button type="button" class="btn btn-default"></button>
                        <span>Publish</span>
                     </label>
                    </div>
                  </div> <!-- row-->


                </form>


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
      $(window).resize(function(){
        if($(document).width() >= 768 && $(document).width() < 992){
          $('.photoUp').css({
          width: 177
          });
          $('.pubbutton').css({
          width: 740
          });         
        }
        if($(document).width() >= 992 && $(document).width() < 1200){
          $('.photoUp').css({
          width: 307
          });  
          $('.pubbutton').css({
          width: 940
          });       
        }
        if($(document).width() >= 1200){
          $('.photoUp').css({
          width: 277
          });
          $('.pubbutton').css({
          width: 1140
          });         
        }
        
      });
    </script>

    <script type="text/javascript">
      $(window).resize();
    </script>

    <script type="text/javascript">
      $(document).ready( function() {
          $(".file-upload input[type=file]").change(function(){
              var filename = $(this).val().replace(/.*\\/, "");
              
              document.getElementById('filename').style.background=' url(img/loader.gif) no-repeat center center';
              setTimeout( function() {
                $('#doc').fadeOut(100);
                document.getElementById('filename').style.background='#fff';
                $("#filename").val(filename);
                $('#pubes').fadeIn(800);

              },1200);
          });
      });

    </script>

  </body>
</html>
