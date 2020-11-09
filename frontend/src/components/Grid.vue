<template>
  <v-data-table
    :headers="colunas"
    :items="linhas"
    :items-per-page="5"
    class="elevation-3"
  >
    <template v-slot:[`item.id`]="{ item }">
      <div class="row">
        <v-btn title="Editar" @click="editar(item.id)" icon>
          <v-icon small>fas fa-edit</v-icon>
        </v-btn>
        <v-btn title="Excluir" @click="excluir(item.id)" icon>
          <v-icon small>fas fa-trash</v-icon>
        </v-btn>
      </div>
    </template>
  </v-data-table>
</template>

<script>
export default {
  name: "Grid",
  props: ["colunas", "linhas"],
  data: function () {
    return {};
  },
  methods: {
    editar: function (id) {
      console.log(id, "id");
    },
  },
};
</script>

<style>
</style>
