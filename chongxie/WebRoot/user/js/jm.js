
    //��ȡpublic key
    var publicKey = null;
    function getPublicKey() {   
        //�½�һ��XHR����ֻ֧��IE7���ϵ������
        var xhr = new XMLHttpRequest();

        //��Ҫ���ʵ�����
        var urlString = "/com.dc365.chongxie/PasswordEncrypt.action";
        xhr.open("post", urlString, true);
        xhr.send(null);

        //�����Ӧ��״̬   
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
        //��������м���
        var encrypt = new JSEncrypt();

        encrypt.setPublicKey(publicKey);
        var password = document.getElementById("userpassword").value;
        document.getElementById("userpassword").value = encrypt.encrypt(password);

        //�ύ֮ǰ������Ƿ��Ѿ����ܡ������û������벻����20λ�����ܺ�����벻С��20λ
        var password = document.getElementById("userpassword").value;
        if(password.length < 20) {
            //ʵ����ʾ�����Ի�һ��˵��
            alert("encryption failed");
            //��û�м��ܣ���ֹ�ύ
            event.preventDefault();
        }
    }
    var password = document.getElementById("userpassword");
    //����¼�������������ʧȥ����ʱ������publicKey
    password.addEventListener("blur", getPublicKey, false);
    var loginForm = document.getElementById("loginForm");
    //�ύʱ�����м���
    loginForm.addEventListener("submit", encryptPassword, false);
