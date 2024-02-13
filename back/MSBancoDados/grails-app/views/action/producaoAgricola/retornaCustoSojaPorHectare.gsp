<div class="container">
    <h1>Resultados Custo Soja Por Hectare</h1>

    <table class="table">
        <thead>
        <tr>
            <th>Cultura</th>
            <th>Unidade</th>
            <th>Custo por Hectare</th>
            <th>Safra Ano</th>
            <th>Valor Faturado</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${resultados}" var="resultado">
            <tr>
                <td>${resultado.cultura}</td>
                <td>${resultado.unidade}</td>
                <td>${resultado.custoPorHectare}</td>
                <td>${resultado.safraAno}</td>
                <td>${resultado.valorFaturado}</td>
            </tr>
        </g:each>
        </tbody>
    </table>
</div>