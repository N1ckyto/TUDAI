document.getElementById("btn_prender").addEventListener("click", prender);
document.getElementById("btn_apagar").addEventListener("click", apagar);
apagar();


function prender() {
    document.getElementById("img-id").src = "imges/lampara_on.png";
    document.getElementById("fondo").classList.add("prendido");
    document.getElementById("fondo").classList.remove("apagado");

}

function apagar() {
    document.getElementById("img-id").src = "imges/lampara_off.png";
    document.getElementById("fondo").classList.add("apagado");
    document.getElementById("fondo").classList.remove("prendido");

}


