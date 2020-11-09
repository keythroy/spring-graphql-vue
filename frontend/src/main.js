import Vue from "vue";
import App from "./App.vue";

import router from "./router";
import store from "./store";
import Vuetify from "vuetify/lib";
import vuetify from "./plugins/vuetify";
import ApolloClient from "apollo-boost";
import VueApollo from "vue-apollo";

Vue.config.productionTip = false;

const apolloClient = new ApolloClient({
  uri: "http://localhost:8089/graphql",
});

Vue.use(VueApollo);
Vue.use(Vuetify);

// export default new Vuetify({
//   icons: {
//     iconfont: "fa", // 'mdi' || 'mdiSvg' || 'md' || 'fa' || 'fa4' || 'faSvg'
//   },
// });

const apolloProvider = new VueApollo({
  defaultClient: apolloClient,
});

new Vue({
  store: store,
  router: router,
  vuetify,
  render: (h) => h(App),
  apolloProvider,
}).$mount("#app");
