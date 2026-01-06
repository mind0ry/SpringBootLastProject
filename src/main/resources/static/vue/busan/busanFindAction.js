const {createApp,onMounted, ref} = Vue
    	const {createPinia} = Pinia
    	const busanApp=createApp({
    		setup() {
    			const store=useBusanStore()
    			const addressRef=ref('강서구')
    			
    			onMounted(()=>{
    				store.busanFindData()
    			})
    			
    			return {
    				store,
    				addressRef
    			}
    		}
    	})
    	busanApp.use(createPinia())
    	busanApp.mount("#busan_find")