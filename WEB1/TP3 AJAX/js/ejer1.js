let btn = document.querySelector("#btn_show");
btn.addEventListener("click", mostrar);

async function mostrar(e) {
    e.preventDefault()
    let container = document.querySelector(".container");
    container.innerHTML = "<h1> Loading... </h1>";
    try {
        let response = await fetch("https://web-unicen-service.onrender.com/api/html");
        if (response.ok) {
            let t = await response.text();
            container.innerHTML = t;
        } else
            container.innerHTML = "<h1>Error - Failed URL!</h1>";
    }
    catch (error) {
        container.innerHTML = "<h1>Connection error</h1>";
    };
}