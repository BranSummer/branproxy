function getPermissionSelector() {
    $.ajax({
        url: "/user/permission/selector",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        type: "get",
        success: function (data) {
            return data;
        }
    });
}

function addRole(data) {

}