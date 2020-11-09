<template>
  <v-app>
    <v-dialog v-model="dialog" persistent max-width="600">
      <template v-slot:activator="{ on, attrs }">
        <v-btn v-bind="attrs" v-on="on" class="btn-primary circle" small>
          <i class="material-icons pmd-sm">add</i>
        </v-btn>
      </template>
      <v-card>
        <v-card-text>
          <component :is="formChild" v-on:fechar="fechar"></component>
        </v-card-text>
      </v-card>
    </v-dialog>
  </v-app>
</template>
<script>
import ImovelForm from "@/components/ImovelForm";

export default {
  name: "ModalForm",
  props: ["titulo", "botaotexto"],
  components: { ImovelForm },
  data() {
    return {
      dialog: false,
      formChild: "ImovelForm",
    };
  },
  methods: {
    fechar: function () {
      this.dialog = false;
    },
  },
};
</script>

<style>
.v-application--wrap {
  min-height: auto !important;
  display: flex !important;
  align-items: right !important;
}
</style>>