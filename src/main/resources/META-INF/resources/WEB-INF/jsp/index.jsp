<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<!DOCTYPE html>
<html>
<head>


    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Static content -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

    <script type="text/javascript" src="static/js/app.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">

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

    <script>
    function validate(id) {

        var name = document.getElementById(id).value;
        if (name == '') {

            $("#myModal").modal()


        return false;
        } else {
        return true;
        }
    }
    </script>
</head>

<body>

<div class="container-fluid container-padding-small color-1 text-center">
    <h1 class="display-2">HistoryGO</h1>
    <h1><small>Administrative panel</small></h1>
</div>


<div class="container-fluid container-padding-small color-4 text-center">
    <h2 class="display-2">Users</h2>
</div>

<div class="container-fluid  container-padding-big color-3 text-center">
    <form action="userDetails" method="post" onsubmit="return validate('nameValueSearch')">

        <div class="row">
            <div class="col-sm-8"><h3> <b>Search for user and show account's details</b></h3></div>

            <div class="col-sm-2">
                <div class="form-group">
                    <input type="text" class="form-control"  id="nameValueSearch" name="name" placeholder="Nickname">
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









    <!--
    <form action="addUser" method="post" onsubmit="return validate('nameValueAdd')">
        <div class="row">
            <div class="col-sm-8"> <h4> Add user to database </h4> </div>
            <div class="col-sm-2">
                <input type="text" class="form-control" id="nameValueAdd" name="name" placeholder="Nickname">
            </div>
            <div class="col-sm-2"> <input type="submit" class="btn btn-warning" value="Add"> </div>
        </div>
    </form>
    -->


    <div class="container-fluid container-padding-big color-2">
        <div id="accordion-add-user">
            <div class="card color-2">
                <div class="card-header color-2">
                    <a class="card-link color-2" data-toggle="collapse" href="#collapse-add-user">
                        <div class="text-center"><h2>Add user to database</h2></div>
                    </a>
                </div>
                <div id="collapse-add-user" class="collapse" data-parent="#accordion-add-user">
                    <div class="card-body">

                        <div class="container color-2">
                            <form class="form-horizontal" method="post" action="/addUserWithDetails">

                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="name"><b>Nickname:</b></label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="name" placeholder="Enter Nickname" name="name">
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="email"><b>Email:</b></label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="country"><b>Country:</b></label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="country" placeholder="Enter country" name="country">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10">
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>

                </div>
            </div>
        </div>

    </div>



<div class="container-fluid container-padding-big color-3 text-center">
    <form action="listUsers" method="post" >
        <div class="row">
            <div class="col-sm-8"> <h3> <b>List all users</b> </h3> </div>
            <div class="col-sm-4 float-left"> <input type="submit" class="btn btn-info" value="Find all"></div>
        </div>
    </form>
</div>






<div class="container-fluid container-padding-big color-2 text-center">
    <form action="delete" method="post" onsubmit="return validate('nameValueDelete')">
        <div class="row">
            <div class="col-sm-8"> <div class="color-2">  <h3> <b>Delete user from base</b> </h3>  </div></div>
            <div class="col-sm-2"> <input name="name"  id="nameValueDelete" type="text" class="form-control" placeholder="Nickname" > </div>
            <div class="col-sm-2">  <input type="submit" class="btn btn-danger" value="Delete"> </div>
        </div>
    </form>
</div>


<div class="container">
    <div class="modal fade" id="myModal" role="dialog">
        <div class="modal-dialog">

            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Empty field detected!</h4>
                </div>
                <div class="modal-body">
                    <p>Please fill this field with correct name.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</div>





<div class="container-fluid container-padding-small color-4 text-center">
    <h2 class="display-2">Places</h2>
</div>




<div class="container-fluid  container-padding-big color-2 text-center">
    <form action="placeDetails" method="post" onsubmit="return validate('nameValuePlaceSearch')">
        <div class="row">
            <div class="col-sm-8"><h3><b>Search for place details</b></h3></div>
            <div class="col-sm-2">
                <div class="form-group">
                    <input type="text" class="form-control"  id="nameValuePlaceSearch" name="name" placeholder="Name">
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



<div class="container-fluid container-padding-big color-3 text-center">
    <form action="listPlaces" method="post" >
        <div class="row">
            <div class="col-sm-8"> <h3> <b>List all places</b> </h3> </div>
            <div class="col-sm-4 float-left"> <input type="submit" class="btn btn-info" value="Find all"></div>
        </div>
    </form>
</div>





<div class="container-fluid container-padding-big color-2">
    <div id="accordion-add-place">
        <div class="card color-2">
            <div class="card-header color-2">
                <a class="card-link color-2" data-toggle="collapse" href="#collapse-add-place">
                    <div class="text-center"><h2>Add place to database</h2></div>
                </a>
            </div>
            <div id="collapse-add-place" class="collapse" data-parent="#accordion-add-place">
                <div class="card-body">

                    <div class="container color-2">
                        <form class="form-horizontal" method="post" action="/addPlaceWithDetails">

                            <div class="form-group">
                                <label class="control-label col-sm-2" for="name"><b>Name:</b></label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" placeholder="Enter name" name="name" required >
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="description">Description:</label>
                                <textarea class="form-control" rows="5" id="description" name="description" required ></textarea>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2" for="year"><b>Year:</b></label>
                                <div class="col-sm-10">
                                    <input type="number" class="form-control" id="year" placeholder="Enter year" name="year" required >
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2" for="points"><b>Points:</b></label>
                                <div class="col-sm-10">
                                    <input type="number" class="form-control" id="points" placeholder="Enter points" name="points" required >
                                </div>
                            </div>


                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GPS_E"><b>GPS_E:</b></label>
                                <div class="col-sm-10">
                                    <input type="number" step="0.0000001" class="form-control" id="GPS_E" placeholder="Enter GPS E" name="GPS_E" required >
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-sm-2" for="GPS_N"><b>GPS_N:</b></label>
                                <div class="col-sm-10">
                                    <input type="number" step="0.0000001" class="form-control" id="GPS_N" placeholder="Enter GPS N" name="GPS_N" required >
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                </div>
                            </div>
                        </form>
                    </div>

                </div>

            </div>
        </div>
    </div>

</div>




<div class="container-fluid container-padding-big color-3 text-center">
    <form action="deletePlace" method="post" onsubmit="return validate('nameValuePlaceDelete')">
        <div class="row">
            <div class="col-sm-8">  <h3>  <b> Delete place from database </b> </h3> </div>
            <div class="col-sm-2"> <input name="name"  id="nameValuePlaceDelete" type="text" class="form-control" placeholder="Name" > </div>
            <div class="col-sm-2">  <input type="submit" class="btn btn-danger" value="Delete"> </div>
        </div>
    </form>
</div>

</body>
</html>