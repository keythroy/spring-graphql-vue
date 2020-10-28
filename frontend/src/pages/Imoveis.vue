<template>
  <div class="register-box">
    <div class="register-logo">
      <router-link to="/"> <b>Real</b>Will<b>State</b> </router-link>
    </div>

    <div class="card">
      <div class="card-body register-card-body">
        <img src="./../../assets/img/logo_imoveis.png" alt="" />

        <form></form>

        <div class="social-auth-links text-center">
          <p>- YA DA -</p>
          <a href="#" class="btn btn-block btn-primary">
            <i class="fa fa-facebook mr-2"></i>
            Facebook ile kayıt ol
          </a>
        </div>

        <router-link to="login" class="text-center"
          >Zaten bir hesabım var.</router-link
        >
      </div>
      <!-- /.form-box -->
    </div>
    <!-- /.card -->
  </div>
</template>

<script>
export default {
  name: "Register",
  data: function () {
    return {};
  },
  methods: {
    register: function () {
      this.$router.push({ path: "/" });
    },
  },
  created: function () {
    document.body.classList.add("register-page");
  },
  destroyed: function () {
    document.body.classList.remove("register-page");
  },
};
</script>

<style>
</style>
