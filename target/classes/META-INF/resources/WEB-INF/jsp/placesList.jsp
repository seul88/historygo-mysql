<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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


    <link rel="stylesheet" href="/resources/css/style.css">

    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>HistoryGO</title>
</head>



<body style="background-color: aliceblue">

<div class="jumbotron">

    <div class="row">
        <button type="button" onclick="location.href = '/';" class="btn rounded-circle">
            <i class="fas fa-arrow-circle-left fa-7x"></i>
        </button>

        <h1 class="display-1 text-center" style="margin-left: 38px; " > Places </h1>
    </div>
</div>


<div class="container-fluid">


    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8">
            <table class="table table-bordered table-striped ">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Points</th>
                    <th>Options</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${places}" var="site">

                    <tr>
                        <td> <b> <c:out value="${site.name}" />  </b> </td>
                        <td>  <c:out value="${site.points}"/> </td>
                        <td>
                            <form action="placeDetails" method="post">
                                <input type = "hidden" name="name" value="${site.name}"> <input type="submit" class="btn btn-success m-1 pl-5 pr-5" value="Show details">
                            </form>

                            <form action="delete" method="post">
                                <input type = "hidden" name="name" value="${site.name}"> <input type="submit" class="btn btn-danger m-1 pl-5 pr-5" value="DELETE">
                            </form>
                        </td>
                    </tr>

                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="col-sm-2"></div>
    </div>

</div>


</body>
</html>