"use strict"
let btn_1 = document.getElementById("btn_1");
btn_1.addEventListener("click", tocar_1);

let btn_2 = document.getElementById("btn_2");
btn_2.addEventListener("click", tocar_2);

let btn_3 = document.getElementById("btn_3");
btn_3.addEventListener("click", tocar_3);


function tocar_1() {
    document.getElementById("mensaje_boton").innerHTML = "1";
}

function tocar_2() {
    document.getElementById("mensaje_boton").innerHTML = "2";
}

function tocar_3() {
    document.getElementById("mensaje_boton").innerHTML = "3";
}
