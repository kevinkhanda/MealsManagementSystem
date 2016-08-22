<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Innopolis - Publish Menu</title>
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
                        <li><a href="main.jsp">Main Page<span class="sr-only">(current)</span></a></li>
                        <li><a href="menu.jsp">Menu</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="pubnews.jsp">Publish News & Menu</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="userform.jsp">Add New User</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <!--тут будет использоваться картинка пользователя -->
                            <div class="col-xs-2 col-sm-2"> <img src="img/user.png" width="40" height="40" class="img-circle userlogo"> </div>
                            <div class="col-xs-10 col-sm-10 username">Альберт Сахапов</div>  <!-- Здесь будет использоваться имя и фамилия пользователя-->

                            <div class="col-xs-1 col-sm-1 sett"><a href="settings.jsp"><img src="img/settings.png"></a></div>
                            <div class="col-xs-1 col-sm-1 lout"><a href="index.jsp"><img src="img/logout4.png"></a></div>


                        </li>
                    </ul>

                </div><!-- /.navigation bar -->
            </div>
        </nav>


        <div id="page">
            <div class="row">
                <form>
                    <div class="headus">
                        Activation History
                    </div>

                    <table class="table table-hover bi">
                        <thead>
                        <tr>
                            <th>id</th>
                            <th>Date</th>
                            <th>Meal Type</th>
                            <th>Full Name</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">1423</th>
                            <td>22.08.2016 12:17</td>
                            <td>Lunch</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">3813</th>
                            <td>22.08.2016 08:34</td>
                            <td>Breakfast</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">3301</th>
                            <td>21.08.2016 18:56</td>
                            <td>Dinner</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">3099</th>
                            <td>21.08.2016 14:02</td>
                            <td>Lunch</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">2802</th>
                            <td>21.08.2016 08:27</td>
                            <td>Breakfast</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">2643</th>
                            <td>20.08.2016 19:07</td>
                            <td>Dinner</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">2430</th>
                            <td>20.08.2016 13:37</td>
                            <td>Lunch</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        </tbody>
                    </table>
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
    $(window).resize();
</script>

</body>
</html>
