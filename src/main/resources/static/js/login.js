/**
 * @return {boolean}
 */
function Login() {
    const username = $("#username").val();

    const password = $("#password").val();

    if (username === "") {
        alert("用户名不能为空!");
        return false;
    }
    else if (password === "") {
        alert("密码不能为空!");
        return false;
    } else {
        $.ajax({
            type: 'post',
            url: '/login',
            dataType: 'json',
            data: {username: username, password: password},
            async: true,
            success: function (data) {
                if (data === false) {
                    alert("密码错误");
                } else {
                    alert("登录成功");
                    window.location.href = '/ok';
                }
            }
        });
    }
}