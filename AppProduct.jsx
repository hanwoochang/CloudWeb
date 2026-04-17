import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css'
import CreateProductForm from './components/CreateProductForm'
import NavBar from "./components/NavBar";
import ProductList from "./components/ProductList";
import { ProductListProvider } from "./context/ProductContext";
import ProductDetail from "./components/ProductDetail";
import UpdateProductForm from './components/UpdateProductForm';


export default function AppProduct() {
    return <Router>
    <ProductListProvider>
      <div className="container">
        <NavBar />
        <hr />
        <Routes>
          <Route path="/new" element={<CreateProductForm />} />
          <Route path="/" >
            <Route index element={<ProductList />} />
            <Route path=":id" element={<ProductDetail />} />
            <Route path=":id/edit" element={<UpdateProductForm />} />
          </Route>
        </Routes>
      </div>
    </ProductListProvider>
  </Router>
}