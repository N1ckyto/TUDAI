document.getElementById("tu_sueño").addEventListener("click", sueño);
document.getElementsByClassName("mentira").addEventListener("click", mentira);
mentira();

function sueño() {
   document.getElementById("img_id").src = "imges/MmJiLmpwZw.jpg";
}
function mentira() {
    document.getElementById("img_id").src = "imges/P3c9NDUw.jpg";
}