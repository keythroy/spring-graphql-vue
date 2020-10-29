<template>
  <div class="">
    <div class="register-logo">
      <router-link to="/"> <b>Real</b>Will<b>State</b> </router-link>
    </div>

    <div class="card col-12">
      <div class="card-body register-card-body">
        <img
          src="../assets/img/logo-imoveis-s-nome.png"
          alt=""
          class="img-thumbnail"
          style="border: 0px"
        />
        <div class="row">
          <ag-grid-vue
            style="width: 100%; height: 400px"
            class="ag-theme-alpine"
            :columnDefs="columnDefs"
            :rowData="rowData"
          >
          </ag-grid-vue>
        </div>
      </div>
      <!-- /.form-box -->
    </div>

    <!-- /.card -->
  </div>
</template>

<script>
import "ag-grid-community/dist/styles/ag-grid.css";
import "ag-grid-community/dist/styles/ag-theme-alpine.css";
import { AgGridVue } from "ag-grid-vue";

export default {
  name: "Imoveis",
  data: function () {
    return {};
  },
  methods: {
    register: function () {
      this.$router.push({ path: "/" });
    },
  },
  components: {
    AgGridVue,
  },
  beforeMount() {
    this.columnDefs = [
      { headerName: "Make", field: "make" },
      { headerName: "Model", field: "model" },
      { headerName: "Price", field: "price" },
    ];

    this.rowData = [
      { make: "Toyota", model: "Celica", price: 35000 },
      { make: "Ford", model: "Mondeo", price: 32000 },
      { make: "Porsche", model: "Boxter", price: 72000 },
    ];
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
