import { BrowserRouter as Router, Routes, Route, NavLink, useParams, useNavigate, useSearchParams } from 'react-router-dom';


const Home = () => <div>Home!!!!</div>
const About = () => <div>About!!!!!</div>
const Service = () => {
  const { id } = useParams();
  return <div>Service!!!!! {id}</div>
}

const Board = () =>{
  const [query, setQuery] = useSearchParams()
  const navigate = useNavigate()

  return <div>
      id={query.get("id")}, name={query.get("name")}
      <button onClick={()=>navigate("/service/3")}>click</button>
  </div>
}

function AppRouter() {
  return (
    <div> 
      <Router>
        <NavLink to="/" >[Home]</NavLink>
        <NavLink to="/about" >[About]</NavLink>
        <NavLink to="/service/1" >[Service 1]</NavLink>
        <NavLink to="/service/2" >[Service 2]</NavLink>      
        <NavLink to="/board?id=56&name=이순신" >[Board]</NavLink>      
        <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/about" element={<About />} />
              <Route path="/service/:id" element={<Service />} />
              <Route path="/board" element={<Board />} />
        </Routes>
    </Router>
    Footer
    </div>
  );
}

export default AppRouter;
