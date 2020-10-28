<template>
  <div class="register-box">
    <div class="register-logo">
      <router-link to="/"> <b>Real</b>Will<b>State</b> </router-link>
    </div>

    <div class="card">
      <div class="card-body register-card-body">
        <img
          src="../assets/img/logo-imoveis-s-nome.png"
          alt=""
          class="img-thumbnail"
          style="border: 0px"
        />

        <form></form>
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
