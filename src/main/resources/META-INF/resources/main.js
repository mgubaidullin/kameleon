import Vue from '/js/vue.esm.browser.min.js'
import { MainTemplate } from './templates/main-template.js'
import { Standalone } from './components/standalone.js'
import { Spring } from './components/spring.js'
import { Quarkus } from './components/quarkus.js'

// Router
Vue.use(VueRouter);
const router = new VueRouter({
  routes: [
    { path: '/', redirect: "/standalone" },
    { path: '/standalone', component: Standalone, name: "Standalone" },
    { path: '/spring', component: Spring, name: "Spring" },
    { path: '/quarkus', component: Quarkus, name: "Quarkus" }
  ]
})

// Application
var client = new Vue({
  el: '#app',
  router,
  template: MainTemplate,
})