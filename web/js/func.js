$(document).ready(function () {

    $('#cedula').focusout(function () {

        var cedula = $('#cedula').val();

        $.ajax({
            url: "ValidarCedula",
            method: "POST",
            data: {'cedula': cedula},
            success: function (data) {
                
                if(data==1){
                    alert("el registro ya existe");
  
                }else{
                   
                }
            }
        });




    });



    $('#FormularioRegistroEmpleado').bootstrapValidator({
        container: '#mensajes',
       feedbackIcons:{
           valid: 'glyphicon glyphicon-ok bg-success',
           invalid: 'glyphicon glyphicon-remove',
           validating: 'glyphicon glyphicon-refresh'
       },
        fields: {
            usuario: {
                validators: {
                    notEmpty: {
                        message: 'El campo no puede estar vacio'
                    }
                }
            },
            contrasena: {
                validators: {
                    notEmpty: {
                        message: 'El campo contraseña no puede estar vacio',
                        
                              
                    }
                }
            },
            rol: {
                validators: {
                    notEmpty: {
                        message: 'El Campo rol no puede estar vacio'
                    }
                }
            },
            nombre: {
                validators: {
                    notEmpty: {
                        message: 'El campo nombre no puede estar vacio'
                    }
                }
            },
            cedula: {
                validators: {
                    notEmpty: {
                        message: 'el campo cedula no puede estar vacio'
                    }
                }
            }



        }
    });
    $('#aceptarUser').click(function(event){
    event.preventDefault();
        alert("hihi");
    var nombre=$('#nombre').val();
    var cedula=$('#cedula').val();
    var rol= $('#rol').val();
    var usuario= $('#usuario').val();
    var contrasena= $('#contrasena').val();
    
    var data= {
        
        nombre:nombre,
        cedula:cedula,
        rol:rol,
        usuario:usuario,
        contrasena:contrasena
 
    }
 
        $.ajax({
           url:'InsertarUsuario',
            type: 'POST',
            data: data,
            success: function (data) {
                alert(data);
                window.location.href = "login.jsp";
            }
            
            
        });
    
});
});


