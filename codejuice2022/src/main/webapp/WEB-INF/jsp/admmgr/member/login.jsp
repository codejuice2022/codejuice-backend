<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    
   <title>Login</title>
   <!-- Custom fonts for this template-->
    <link href="/common/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/common/css/sb-admin-2.min.css" rel="stylesheet">
    
   <link href="/common/js/jquery-1.11.2.min.js" rel="stylesheet">
   <style>
      .bg-gradient-primary2 {
          background-color: #5F0080;
          background-size: cover;
      }
      .btn-primary2 {
          color: #fff;
          background-color: #5F0080;
          border-color: #5F0080;
      }
   </style>
   <script type="text/javascript">
      function fn_Login(){
         if( $("#userId").val() == "" ){
            alert("아이디를 입력해 주세요.");
            $("#userId").focus();
            return false;
         }
         if( $("#userPw").val() == "" ){
            alert("비밀번호를 입력해 주세요.");
            $("#userPw").focus();
            return false;
         }
         $("#frm").submit();
      }
   </script>
</head>
<body class="bg-gradient-primary2">

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center" style="margin:23% 0;">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block" style="background: #fff url(https://res.kurly.com/images/event/introduce/210801/pc/intro_main2.jpg?ver=1) no-repeat 50% -100px;background-position: center;background-size: cover;"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">codeJuice Admin Login</h1>
                                    </div>
                                    <form id="frm" name="frm" method="post" action="/admmgr/member/LoginProc.do" class="user">
                                        <div class="form-group">
                                            <input type="text" class="form-control form-control-user" id="userId" name="userId" aria-describedby="emailHelp" placeholder="사원 코드">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control form-control-user" id="userPw" name="userPw" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <!-- <div class="custom-control custom-checkbox small">
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                                <label class="custom-control-label" for="customCheck">Remember
                                                    Me</label>
                                            </div> -->
                                        </div>
                                        <a href="javascript:fn_Login();" class="btn btn-primary2 btn-user btn-block">
                                            Login
                                        </a>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="/common/vendor/jquery/jquery.min.js"></script>
    <script src="/common/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/common/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/common/js/sb-admin-2.min.js"></script>

</body>
</html>