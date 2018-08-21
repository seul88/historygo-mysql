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
    <title>HistoryGO</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body style="background-color: aliceblue">


<div class="jumbotron text-center">  <h1 class="display-1">  Player's profile </h1>
</div>


<div class="container-fluid">

    <div class="row">
        <div class="col-sm-4">
            <h1 class="display-1"><c:out value="${name}"/></h1>

            <h1><small>Points:</small> <c:out value="${points}"/></h1>
            <h1><small>ID:</small>  <c:out value="${id}"/></h1>
            <h1><small>e-mail:</small> <c:out value="${email}"/> </h1>
            <h1><small>Country:</small> <c:out value="${country}"/> </h1>
            <h1><small>Registration date:</small> </h1>
        </div>


        <!--
        <div class="col-sm-8">
            <h1 class="display-3"> Lista odwiedzonych miejsc </h1>



            <c:forEach items="${places}" var="place">

                Name: <c:out value="${place.name}"/></br></br>
                Description: <c:out value="${place.description}"/></br></br>
                Points: <c:out value="${place.points}"/></br></br><hr></br>
            </c:forEach>

        </div>
         -->


    </div>
</div>
</body>
</html>