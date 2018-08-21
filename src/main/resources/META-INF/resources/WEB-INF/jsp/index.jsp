<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<!DOCTYPE html>
<html>
<head>


    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Static content -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/style.css">
    <script type="text/javascript" src="/resources/js/app.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <title>HistoryGO</title>


    <style>
        .color-1{
            background-color: #F8E4CC;
            color: #153450;
        }
        .color-2{
            background-color: #447294;
            color: #F4D6BC;
        }
        .color-3{
            background-color: #8FBCDB;
            color: #153450;
        }
        .color-4{
            background-color: #153450;
            color: #F8E4CC;
        }
        .container-padding-large {
            padding-top: 150px;
            padding-bottom: 150px;
        }
        .container-padding-big {
            padding-top: 70px;
            padding-bottom: 70px;
        }
        .container-padding-small {
            padding-top: 30px;
            padding-bottom: 30px;
        }
    </style>

</head>

<body>

<div class="container-fluid container-padding-small color-1 text-center">
    <h1 class="display-2">HistoryGO</h1>
    <h1><small>Administrative panel</small></h1>
</div>


<div class="container-fluid  container-padding-big color-3 text-center">
    <form action="userDetails" method="post" onsubmit="return validate()">

        <div class="row">
            <div class="col-sm-8"><h4> Search for user and show account's details</h4></div>

            <div class="col-sm-2">
                <div class="form-group">
                    <input type="text" class="form-control"  name="name" placeholder="Nickname">
                </div>
            </div>

            <div class="col-sm-2">
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Search">
                </div>
            </div>


        </div>

    </form>
</div>


<div class="container-fluid container-padding-big color-4 text-center">
    <form action="listUsers" method="post">
        <div class="row">
            <div class="col-sm-8"> <h4> List all users </h4> </div>
            <div class="col-sm-4 float-left"> <input type="submit" class="btn btn-info" value="Find all"></div>
        </div>
    </form>
</div>


<div class="container-fluid container-padding-big color-2 text-center">
    <form action="addUser" method="post">
        <div class="row">
            <div class="col-sm-8"> <h4> Add user to database </h4> </div>
            <div class="col-sm-2">
                <input type="text" class="form-control"  name="name" placeholder="Nickname">
            </div>
            <div class="col-sm-2"> <input type="submit" class="btn btn-warning" value="Add"> </div>
        </div>
    </form>
</div>


<div class="container-fluid container-padding-big color-4 text-center">
    <form action="delete" method="post">
        <div class="row">
            <div class="col-sm-8"> <div class="text-danger">  <h4> Delete user from base </h4>  </div></div>
            <div class="col-sm-2"> <input name="name" type="text" class="form-control" placeholder="Nickname" > </div>
            <div class="col-sm-2">  <input type="submit" class="btn btn-danger" value="Delete"> </div>
        </div>
    </form>



</div>






</body>
</html>