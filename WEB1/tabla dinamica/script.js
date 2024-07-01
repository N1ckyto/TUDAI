$(document).ready(function () {
    const apiUrl = "https://6660dadb63e6a0189fe7b969.mockapi.io/api/usuario";

    // Función para cargar los datos
    function loadData() {
        $.get(apiUrl, function (data) {
            const tbody = $("#blogTable tbody");
            tbody.empty(); // Limpiar la tabla
            data.forEach(user => {
                const row = `<tr data-id="${user.id}">
                                <td>${user.id}</td>
                                <td>${user.name}</td>
                                <td>${user.email}</td>
                                <td>
                                    <button class="editBtn"><i class="fas fa-edit"></i> Editar</button>
                                    <button class="deleteBtn"><i class="fas fa-trash-alt"></i> Eliminar</button>
                                </td>
                             </tr>`;
                tbody.append(row);
            });
        });
    }

    // Cargar los datos al iniciar
    loadData();

    // Evento para eliminar usuario
    $("#blogTable").on("click", ".deleteBtn", function () {
        const id = $(this).closest("tr").data("id");
        $.ajax({
            url: `${apiUrl}/${id}`,
            type: "DELETE",
            success: function () {
                loadData(); // Recargar los datos
            }
        });
    });

    // Modal de edición
    const modal = $("#editModal");
    const span = $(".close");

    $("#blogTable").on("click", ".editBtn", function () {
        const id = $(this).closest("tr").data("id");
        const name = $(this).closest("tr").find("td:eq(1)").text();
        const email = $(this).closest("tr").find("td:eq(2)").text();

        $("#editName").val(name);
        $("#editEmail").val(email);
        $("#editForm").data("id", id);
        modal.show();
    });

    span.click(function () {
        modal.hide();
    });

    $(window).click(function (event) {
        if ($(event.target).is(modal)) {
            modal.hide();
        }
    });

    $("#editForm").submit(function (event) {
        event.preventDefault();
        const id = $(this).data("id");
        const name = $("#editName").val();
        const email = $("#editEmail").val();

        $.ajax({
            url: `${apiUrl}/${id}`,
            type: "PUT",
            data: {
                name: name,
                email: email
            },
            success: function () {
                modal.hide();
                loadData();
            }
        });
    });

    // Evento para agregar usuario
    $("#addForm").submit(function (event) {
        event.preventDefault();
        const name = $("#addName").val();
        const email = $("#addEmail").val();

        $.post(apiUrl, {
            name: name,
            email: email
        }, function () {
            loadData(); // Recargar los datos
            $("#addForm")[0].reset(); // Limpiar el formulario
        });
    });
});
