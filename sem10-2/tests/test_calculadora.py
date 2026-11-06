import pytest 
from calculadora import sumar, dividir, es_mayor_de_edad

def test_sumar_positivos():
    assert sumar(2, 3) == 5

def test_mayor_de_edad_limite_inferior():
    assert es_mayor_de_edad(18) == True

def test_menor_de_edad_limite_superior():
    assert es_mayor_de_edad(17) == False

def test_dividir_por_cero():
    with pytest.raises(ValueError, match="No se puede dividir por cero"):
        dividir(10, 0)

def test_edad_negativa():
    with pytest.raises(ValueError, match="La edad no puede ser negativa"):
        es_mayor_de_edad(-5)

@pytest.mark.parametrize("a, b, esperado", [
    (1, 1, 2),
    (-1, 1, 0),
    (0, 0, 0),
    (100, 200, 300),
])
def test_sumar_parametrizado(a, b, esperado):
    assert sumar(a, b) == esperado
    