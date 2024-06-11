
function saludo() {
    let nombre = document.querySelector("#nombre").value
    let apellido = document.querySelector("#apellido").value
    console.log("Hola " + nombre + " " + apellido + " !");
    document.querySelector("#vista").innerHTML = "Hola " + nombre + " " + apellido;
}

let contador = 0;
function click1() {
    contador++;
    document.querySelector("#mensaje").innerHTML = "se hizo " + contador + " click";
}