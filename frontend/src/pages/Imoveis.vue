<template>
  <div class="" style="width: 60%">
    <div class="register-logo">
      <router-link to="/"> <b>Real</b>Will<b>State</b> </router-link>
    </div>
    <div class="row d-flex justify-content-center">
      <div style="float-left">
      <Grid :linhas="grid.linhas" :colunas="grid.colunas"></Grid>
      </div>
      <div style="float-right">
        <!-- <button class="btn btn-primary">Cadastrar</button> -->
        <ModalForm
          titulo="Cadastro de Perfil"
          botaotexto="Cadastrar"
        ></ModalForm>
      </div>
    </div>
  </div>
</template>

<script>
import gql from "graphql-tag";
import ModalForm from "@/components/ModalForm";
import Grid from "@/components/Grid";

export default {
  name: "Imoveis",
  components: { ModalForm, Grid },
  data: function () {
    return {
      model: {
        id: null,
        cep: null,
        logradouro: null,
        complemento: null,
        bairro: null,
        cidade: null,
        uf: null,
        quartos: null,
        areaUtil: null,
      },
      grid: {
        colunas: [
          { text: "CEP", value: "cep" },
          { text: "UF", value: "uf" },
          { text: "Cidade", value: "cidade" },
          { text: "N° Qts", value: "quartos" },
          { text: "Área", value: "areaUtil" },
          { text: "Ações", value: "id" },
        ],
        linhas: [],
      },
      imoveis: [],
    };
  },
  apollo: {
    imoveis: gql`
      query {
        imoveis {
          id
          cep
          logradouro
          complemento
          bairro
          cidade
          uf
          quartos
          areaUtil
        }
      }
    `,
  },
  watch: {
    imoveis: function (val) {
      this.grid.linhas = val;
    },
  },
  beforeCreate: function () {
    document.body.classList.add("register-page");
    // console.log(this.imoveis);
  },
  destroyed: function () {
    document.body.classList.remove("register-page");
  },
  methods: {},
};
</script>

<style>
</style>
