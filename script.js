(function() {
  emailjs.init("seu_user_id_aqui"); // Substitua por seu User ID do EmailJS
})();

document.addEventListener("DOMContentLoaded", function () {
  const form = document.getElementById("formContato");
  const mensagem = document.getElementById("mensagemEnviada");

  form.addEventListener("submit", function (e) {
    e.preventDefault();

    emailjs.sendForm("seu_service_id", "seu_template_id", form)
      .then(function () {
        mensagem.style.display = "block";
        form.reset();
      }, function (error) {
        alert("Erro ao enviar. Tente novamente.");
        console.error("Erro:", error);
      });
  });
});