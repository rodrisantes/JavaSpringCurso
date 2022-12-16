// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();

  $('#usuarios').DataTable();
});

   async function cargarUsuarios(){
let listadoHTML = ''
    const response = await fetch("/usuarios").then(res => res.json());
    for (let usuario of usuarios);
    let usuarioHTML =  '<tr><th>123</th><th>' + usuario.nombre + ' ' + usuario.apellido '</th><th>' + usuario.email'</th><th>' + usuario.telefono + '</th><th><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></th></tr>'

    listadoHTML += usuarioHTML
document.querySelector('#usuarios tbody').outerHTML = listadoHTML;

console.log(response)
    }

