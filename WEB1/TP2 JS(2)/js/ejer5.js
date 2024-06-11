let btn = document.getElementById("btn_enviar");
btn.addEventListener("click", mostrar);

function mostrar() {
    let nombre = document.getElementById("form-nombre").value;
    let apellido = document.getElementById("form-apellido").value;
    document.getElementById("title").innerHTML = "Hola " + nombre + " " + apellido;
}