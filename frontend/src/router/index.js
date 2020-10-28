import Vue from 'vue';
import Router from 'vue-router';
import store from './../store';

import Main from './../pages/Main';
import Login from './../pages/Login';
import Register from './../pages/Register';
import Imoveis from './../pages/Imoveis';

import Blank from './../pages/Blank';
import Dashboard from './../pages/Dashboard';
import Profile from './../pages/Profile';

Vue.use(Router);

export default new Router({
    mode: 'history',
    routes: [{
            path: '/blank',
            component: Main,
            beforeEnter(to, from, next) {
                if (store.state.token) {
                    next();
                } else {
                    next();
                }
            },
            children: [
                { path: '/blank', component: Blank },
                { path: 'profile', component: Profile },
                { path: 'dashbooard', component: Dashboard },
            ]
        },
        {
            path: '/login',
            component: Login,
            beforeEnter(to, from, next) {
                if (store.state.token) {
                    next('/');
                } else {
                    next();
                }
            }
        },
        {
            path: '/',
            component: Imoveis,
            beforeEnter(to, from, next) {
                if (store.state.token) {
                    next('/');
                } else {
                    next();
                }
            },
            children: [
                { path: 'register', component: Register },
                { path: 'imoveis', component: Imoveis },
                { path: '/', component: Imoveis }
            ]
        },
    ]
});