
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderPurchaseorderManager from "./components/listers/OrderPurchaseorderCards"
import OrderPurchaseorderDetail from "./components/listers/OrderPurchaseorderDetail"

import SerchGoodsView from "./components/SerchGoodsView"
import SerchGoodsViewDetail from "./components/SerchGoodsViewDetail"
import DeliveryDeliveryManager from "./components/listers/DeliveryDeliveryCards"
import DeliveryDeliveryDetail from "./components/listers/DeliveryDeliveryDetail"

import GoodsGoodsManager from "./components/listers/GoodsGoodsCards"
import GoodsGoodsDetail from "./components/listers/GoodsGoodsDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/purchaseorders',
                name: 'OrderPurchaseorderManager',
                component: OrderPurchaseorderManager
            },
            {
                path: '/orders/purchaseorders/:id',
                name: 'OrderPurchaseorderDetail',
                component: OrderPurchaseorderDetail
            },

            {
                path: '/orders/serchGoods',
                name: 'SerchGoodsView',
                component: SerchGoodsView
            },
            {
                path: '/orders/serchGoods/:id',
                name: 'SerchGoodsViewDetail',
                component: SerchGoodsViewDetail
            },
            {
                path: '/deliveries/deliveries',
                name: 'DeliveryDeliveryManager',
                component: DeliveryDeliveryManager
            },
            {
                path: '/deliveries/deliveries/:id',
                name: 'DeliveryDeliveryDetail',
                component: DeliveryDeliveryDetail
            },

            {
                path: '/goods/goods',
                name: 'GoodsGoodsManager',
                component: GoodsGoodsManager
            },
            {
                path: '/goods/goods/:id',
                name: 'GoodsGoodsDetail',
                component: GoodsGoodsDetail
            },



    ]
})
