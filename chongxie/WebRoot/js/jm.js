
    //获取public key
    var publicKey = null;
    function getPublicKey() {   
        //新建一个XHR对象，只支持IE7以上的浏览器
        var xhr = new XMLHttpRequest();

        //需要访问的链接
        var urlString = "/com.dc365.chongxie/PasswordEncrypt.action";
        xhr.open("post", urlString, true);
        xhr.send(null);

        //检查响应的状态   
        xhr.onreadystatechange = function() {
            if(xhr.readyState == 4) {
                if((xhr.status >= 200 && xhr.status < 300) || xhr.status == 304) {
                    if(xhr.responseText != null) {          
                        publicKey = xhr.responseText;
                    } 
                }
            }   
        };

    }
    function encryptPassword(event) {       
        //对密码进行加密
        var encrypt = new JSEncrypt();

        encrypt.setPublicKey(publicKey);
        var password = document.getElementById("userpassword").value;
        document.getElementById("userpassword").value = encrypt.encrypt(password);

        //提交之前，检查是否已经加密。假设用户的密码不超过20位，加密后的密码不小于20位
        var password = document.getElementById("userpassword").value;
        if(password.length < 20) {
            //实际提示，可以换一种说法
            alert("encryption failed");
            //若没有加密，阻止提交
            event.preventDefault();
        }
    }
    var password = document.getElementById("userpassword");
    //添加事件处理程序：密码框失去焦点时，请求publicKey
    password.addEventListener("blur", getPublicKey, false);
    var loginForm = document.getElementById("loginForm");
    //提交时，进行加密
    loginForm.addEventListener("submit", encryptPassword, false);
