const defaultState={
    title:"Home"
}

const TitleReducer=(state=defaultState,action)=>{
    switch(action.type){
        case "SET_TITLE":{
            console.log(action.payload)
            return{
                ...state,
                title:action.payload
            }
        }
        default:{
            return{
                state
            }
        }
    }
}

export default TitleReducer
