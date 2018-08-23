function Login() {
    // language=JQuery-CSS
    const username = $("input[name='username']").val().trim();
    // language=JQuery-CSS
    const password = $("input[name='password']").val().trim();
    $.ajax({
        url: '/login',
        type: 'POST',
        dataType: 'JSON',
        data: {
            "username": username,
            "password": password
        },
        success: function (data) {
            if (data) {
                alert("登录成功" + data);
                window.location.href = "/index"
            } else {
                alert("登录失败" + data);
            }
        }
    });
}