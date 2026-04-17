import {  createContext, useContext, useState } from 'react';
import { BrowserRouter as Router, Routes, Route, NavLink, useParams, useNavigate, useSearchParams } from 'react-router-dom';


const DemoContext = createContext();


const Page1 = () => {
  const name = useContext(DemoContext)
  return <div>name={name}</div>
}

const Page2 = () => {
  const [id, name] = useContext(DemoContext)
  return <div>id={id} / name={name}</div>
}

const Page3 = () => {
  const {name, id} = useContext(DemoContext)
  return <div>id={id} / name={name}</div>
}

const Page4 = () => {
  const {age, setAge} = useContext(DemoContext)
  return <div>
    age = {age} <br/>
    <button onClick={()=>setAge(145)}>click</button>
    </div>
}

const MyContext = createContext();
const MyProvider =  ({ children }) => {
  const [data, setData] = useState([12, 45, 67])  
  return <MyContext.Provider value={{ data, setData }}>
  {children}
</MyContext.Provider>
}


const Page5 = () => {
  const {data, setData} = useContext(MyContext)
  return <div>
    data = {data} <br/>
    </div>
}





function AppContext() {
  const [age, setAge] = useState(67)

  return (
    <div> 
      <DemoContext.Provider value="hello">
          <Page1/>
      </DemoContext.Provider>

      <DemoContext.Provider value={[56, "이순신"]}>
          <Page2/>
      </DemoContext.Provider>

      <DemoContext.Provider value={{id:70, name:"홍길동"}}>
          <Page3/>
      </DemoContext.Provider>

      <DemoContext.Provider value={{age, setAge}}>
          age = {age} <br/>
          <Page4/>
      </DemoContext.Provider>

      <MyProvider>
          <Page5/>
      </MyProvider>


    </div>
  );
}

export default AppContext;