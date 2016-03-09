<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ROOT" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>testSpringSecurity2EntryPoints</title>

    <link rel="icon" type="image/png" href="${ROOT}/resources/img/favicon.png"/>
    <link rel="stylesheet" href="${ROOT}/resources/css/app.min.css"/>
</head>
<body data-spy="scroll" data-target="#home-left-navbar" data-offset="100">

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#header-navbar-collapse" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">
                <img src="${ROOT}/resources/img/logo.png" style="float:left;margin: -4px 10px 0 0;"/>
                <span>testSpringSecurity2EntryPoints</span>
            </a>
        </div>

        <div id="header-navbar-collapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="https://github.com/choonchernlim/choonchernlim-archetype-webapp">GitHub</a></li>
                <li><a href="http://myshittycode.com">Blog</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            GOODBYE!
        </div>
    </div>
</div>
</div>

<nav class="navbar navbar-default navbar-fixed-bottom">
    <div class="container">
        <p class="navbar-text">Powered by
            <a href="https://github.com/choonchernlim/choonchernlim-archetype-webapp">choonchernlim-archetype-webapp</a>
            Maven Archetype.</p>
    </div>
</nav>

<script src="${ROOT}/resources/js/vendor.min.js"></script>
<script src="${ROOT}/resources/js/app.min.js"></script>
</body>
</html>
