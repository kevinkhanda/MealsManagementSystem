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
                                <li role="separator" class="divider"></li>
                                <li class="active"><a>Show History</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <!--тут будет использоваться картинка пользователя -->
                            <div class="col-xs-2 col-sm-2"> <img src="img/user.png" width="40" height="40" class="img-circle userlogo"> </div>
                            <div class="col-xs-10 col-sm-10 username"><a class="man" href="userhistory.jsp">Альберт Сахапов</a></div>  <!-- Здесь будет использоваться имя и фамилия пользователя-->

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
                            <th scope="row">4243</th>
                            <td>22.08.2016 19:21</td>
                            <td>Dinner</td>
                            <td>Gazizov Damir</td>
                        </tr>
                        <tr>
                            <th scope="row">4242</th>
                            <td>22.08.2016 19:21</td>
                            <td>Dinner</td>
                            <td>Milenko Vladimir</td>
                        </tr>
                        <tr>
                            <th scope="row">4241</th>
                            <td>22.08.2016 19:07</td>
                            <td>Dinner</td>
                            <td>Rautkin Alexey</td>
                        </tr>
                        <tr>
                            <th scope="row">4240</th>
                            <td>22.08.2016 19:07</td>
                            <td>Dinner</td>
                            <td>Legeyda Elina</td>
                        </tr>
                        <tr>
                            <th scope="row">4239</th>
                            <td>22.08.2016 18:57</td>
                            <td>Dinner</td>
                            <td>Yaushev Eduard</td>
                        </tr>
                        <tr>
                            <th scope="row">4238</th>
                            <td>22.08.2016 18:51</td>
                            <td>Dinner</td>
                            <td>Vasilev Vladislav</td>
                        </tr>
                        <tr>
                            <th scope="row">4237</th>
                            <td>22.08.2016 18:49</td>
                            <td>Dinner</td>
                            <td>Radionov Alexey</td>
                        </tr>
                        <tr>
                            <th scope="row">4236</th>
                            <td>22.08.2016 18:49</td>
                            <td>Dinner</td>
                            <td>Bugaev Kirill</td>
                        </tr>
                        <tr>
                            <th scope="row">4235</th>
                            <td>22.08.2016 18:45</td>
                            <td>Dinner</td>
                            <td>Maslov Andrey</td>
                        </tr>
                        <tr>
                            <th scope="row">4234</th>
                            <td>22.08.2016 18:42</td>
                            <td>Dinner</td>
                            <td>Kamsky Arthur</td>
                        </tr>
                        <tr>
                            <th scope="row">4233</th>
                            <td>22.08.2016 18:41</td>
                            <td>Dinner</td>
                            <td>Kandov Sherafgan</td>
                        </tr>
                        <tr>
                            <th scope="row">4232</th>
                            <td>22.08.2016 18:38</td>
                            <td>Dinner</td>
                            <td>Bochkaryov Semyon</td>
                        </tr>
                        <tr>
                            <th scope="row">4231</th>
                            <td>22.08.2016 18:38</td>
                            <td>Dinner</td>
                            <td>Pinzaru Gheorghe</td>
                        </tr>
                        <tr>
                            <th scope="row">4230</th>
                            <td>22.08.2016 18:35</td>
                            <td>Dinner</td>
                            <td>Blinova Svetlana</td>
                        </tr>
                        <tr>
                            <th scope="row">4229</th>
                            <td>22.08.2016 18:33</td>
                            <td>Dinner</td>
                            <td>Mishagin Timur</td>
                        </tr>
                        <tr>
                            <th scope="row">4228</th>
                            <td>22.08.2016 18:29</td>
                            <td>Dinner</td>
                            <td>Dolgushev Alexander</td>
                        </tr>
                        <tr>
                            <th scope="row">4227</th>
                            <td>22.08.2016 18:29</td>
                            <td>Dinner</td>
                            <td>Sayahov Robert</td>
                        </tr>
                        <tr>
                            <th scope="row">4226</th>
                            <td>22.08.2016 18:29</td>
                            <td>Dinner</td>
                            <td>Khokhlov Nikita</td>
                        </tr>
                        <tr>
                            <th scope="row">4225</th>
                            <td>22.08.2016 18:25</td>
                            <td>Dinner</td>
                            <td>Moiseeva Anna</td>
                        </tr>
                        <tr>
                            <th scope="row">4224</th>
                            <td>22.08.2016 18:24</td>
                            <td>Dinner</td>
                            <td>Habirov Bulat</td>
                        </tr>
                        <tr>
                            <th scope="row">4223</th>
                            <td>22.08.2016 18:24</td>
                            <td>Dinner</td>
                            <td>Fomenko Alexey</td>
                        </tr>
                        <tr>
                            <th scope="row">4222</th>
                            <td>22.08.2016 18:22</td>
                            <td>Dinner</td>
                            <td>Habirov Bulat</td>
                        </tr>
                        <tr>
                            <th scope="row">4221</th>
                            <td>22.08.2016 18:21</td>
                            <td>Dinner</td>
                            <td>Skorikov Maxim</td>
                        </tr>
                        <tr>
                            <th scope="row">4220</th>
                            <td>22.08.2016 18:19</td>
                            <td>Dinner</td>
                            <td>Sidorov Anton</td>
                        </tr>
                        <tr>
                            <th scope="row">4219</th>
                            <td>22.08.2016 18:19</td>
                            <td>Dinner</td>
                            <td>Borodulin Nikita</td>
                        </tr>
                        <tr>
                            <th scope="row">4218</th>
                            <td>22.08.2016 18:17</td>
                            <td>Dinner</td>
                            <td>Sizov Alexander</td>
                        </tr>
                        <tr>
                            <th scope="row">4217</th>
                            <td>22.08.2016 18:15</td>
                            <td>Dinner</td>
                            <td>Sakhapov Albert</td>
                        </tr>
                        <tr>
                            <th scope="row">4216</th>
                            <td>22.08.2016 18:14</td>
                            <td>Dinner</td>
                            <td>Hayaliev Artur</td>
                        </tr>
                        <tr>
                            <th scope="row">4215</th>
                            <td>22.08.2016 18:14</td>
                            <td>Dinner</td>
                            <td>Borovik Ilya</td>
                        </tr>
                        <tr>
                            <th scope="row">4214</th>
                            <td>22.08.2016 18:13</td>
                            <td>Dinner</td>
                            <td>Tarasov Alexander</td>
                        </tr>
                        <tr>
                            <th scope="row">4213</th>
                            <td>22.08.2016 18:12</td>
                            <td>Dinner</td>
                            <td>Kulagin Andrey</td>
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
