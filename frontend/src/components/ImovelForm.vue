<template>
  <v-app id="inspire">
    <v-form ref="form" v-model="valid" lazy-validation>
      <v-text-field
        v-if="model.id != null"
        v-model="model.id"
        label="Identificador "
        disabled
      ></v-text-field>

      <v-select
        v-model="model.uf"
        :items="selectUf"
        label="UF"
        persistent-hint
        return-object
        single-line
        :rules="requiredRule"
      ></v-select>

      <v-text-field
        v-model="model.cidade"
        label="Cidade "
        required
        :rules="requiredRule"
      ></v-text-field>

      <v-text-field
        v-model="model.bairro"
        label="Bairro "
        required
        :rules="requiredRule"
      ></v-text-field>

      <v-text-field
        v-model="model.quartos"
        label="Quartos "
        required
        number
        :rules="requiredRule"
      ></v-text-field>

      <v-text-field
        v-model="model.area_util"
        label="Área ùtil "
        required
        :rules="requiredRule"
      ></v-text-field>

      <div class="row d-flex flex-row-reverse">
        <v-btn color="primary" text @click="salvar"> Salvar </v-btn>
        <v-btn color="default" text @click="cancelar"> Cancelar </v-btn>
      </div>
    </v-form>
  </v-app>
</template>

<script>
import gql from "graphql-tag";

export default {
  name: "ImovelForm",
  data() {
    return {
      model: {
        id: null,
        uf: null,
        cidade: null,
        bairro: null,
        quartos: null,
        area_util: null,
      },
      valid: true,
      requiredRule: [
        (v) => !!v || "Campo obrigatório",
        // (v) => (v && v.length <= 10) || "Name must be less than 10 characters",
      ],
      selectUf: [
        "AC",
        "AL",
        "AP",
        "AM",
        "BA",
        "CE",
        "DF",
        "ES",
        "GO",
        "MA",
        "MT",
        "MS",
        "MG",
        "PA",
        "PB",
        "PR",
        "PE",
        "PI",
        "RJ",
        "RN",
        "RS",
        "RO",
        "RR",
        "SC",
        "SP",
        "SE",
        "TO",
      ],
    };
  },
  watch: {},
  apollo: {},
  methods: {
    cancelar: function () {
      this.$emit("fechar");
    },
    salvar: function(){
      if (this.$refs.form.validate()) {
        this.$refs.form.resetValidation();

        const add_imovel = gql`mutation {
            salvarImovel(ImovelInput: {
              cep: $cep,
              uf: $uf,
              cidade: $cidade,
              quartos: $quartos,
              areaUtil: $areaUtil
            }){
              id
              cidade
              uf
            }
          }
        `;
        this.$apollo.mutate({
          mutation: add_imovel,
          variables: {
            cep: this.model.cep,
            uf: this.model.uf,
            cidade: this.model.cidade,
            quartos: this.model.quartos,
            areaUtil: this.model.areaUtil,
          },
          update: (cache, { data: { insert_todos } }) => {
            // Read the data from our cache for this query.
            // eslint-disable-next-line
            console.log(insert_todos);
          }
        });
      }
    }
  },
}
</script>

<style>
</style>
