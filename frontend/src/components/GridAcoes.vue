<script>
import Vue from "vue";
export default Vue.extend({
  name: "GridAcoes",
  template: `
        <span>
    <button @click="alterar()"><i class="fa fa-edit">aaa</i></button>
    <button @click="deletar()"><i class="fa fa-remove">dddd</i></button>
  </span>
    `,
  methods: {
    alterar() {
      this.params.alterar(this.params.value);
    },
    deletar() {
      this.params.deletar(this.params.value);
    },
  },
});
</script>
