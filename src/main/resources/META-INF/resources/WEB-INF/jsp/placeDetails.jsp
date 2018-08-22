<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">

    <title>HistoryGO</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>


<body style="background-color: aliceblue">


    <div class="jumbotron text-center">

        <button type="button" onclick="location.href = '/listPlaces'; method='post';"  class="btn rounded-circle">
            <i class="fas fa-arrow-circle-left fa-7x"></i>
        </button>


        <h1 class="display-1">  Place details </h1>
    </div>


    <div class="container-fluid">

        <div class="row">
            <div class="col-sm-4">
                <h1 class="display-1"><c:out value="${name}"/></h1>

                <h1><small>Points:</small> <c:out value="${points}"/></h1>
                <h1><small>Rating:</small>  <c:out value="${rating}"/></h1>
                <h1><small>Year:</small> <c:out value="${year}"/> </h1>
                <h1><small>Visits:</small> <c:out value="${visits}"/> </h1>
                <h1><small>Description:</small></h1> <c:out value="${description}"/>

            </div>



        </div>
    </div>
</body>
</html>