
@Override
public void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
 
    // Datos para la tabla
    String cabeceras[] = { "Año", "Ciudad", "Oro", "Plata", "Bronce" };
    String datos[][] = { { "1900", "París", "1", "", "" },
                         { "1976", "Montreal", "", "2", "" },
                         { "1992", "Barcelona", "13", "7", "2" },
                         { "2012", "Londres", "3", "10", "4" } };
 
    // TableLayout (diseño principal de la actividad)
    TableLayout tabla = new TableLayout(this);
    tabla.setLayoutParams(new TableLayout.LayoutParams(
       LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
    tabla.setColumnStretchable(1, true);
 
    // Cabecera de la tabla
    TableRow cabecera = new TableRow(this);
    cabecera.setLayoutParams(new TableLayout.LayoutParams(
       LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
    tabla.addView(cabecera);
 
    // Textos de la cabecera
    for (int i = 0; i < 5; i++)
    {
       TextView columna = new TextView(this);
       columna.setLayoutParams(new TableRow.LayoutParams(
          LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
       columna.setText(cabeceras[i]);
       columna.setTextColor(Color.parseColor("#005500"));
       columna.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26);
       columna.setGravity(Gravity.CENTER_HORIZONTAL);
       columna.setPadding(5, 5, 5, 5);
       cabecera.addView(columna);
    }
 
    // Línea que separa la cabecera de los datos
    TableRow separador_cabecera = new TableRow(this);
    separador_cabecera.setLayoutParams(new TableLayout.LayoutParams(
       LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
    FrameLayout linea_cabecera = new FrameLayout(this);
    TableRow.LayoutParams linea_cabecera_params =
       new TableRow.LayoutParams(LayoutParams.FILL_PARENT, 2);
    linea_cabecera_params.span = 6;
    linea_cabecera.setBackgroundColor(Color.parseColor("#FFFFFF"));
    separador_cabecera.addView(linea_cabecera, linea_cabecera_params);
    tabla.addView(separador_cabecera);
 
    // Array para los totales
    int valores_totales[] = { 0, 0, 0 };
 
    // Filas de datos
    for (int f = 0; f < 4; f++)
    {
       TableRow fila = new TableRow(this);
 
       for (int c = 0; c = 2) valores_totales[c-2] += Integer.parseInt(datos[f][c]);
          }
       }
 
       tabla.addView(fila);
    }
 
    // Línea que separa los datos de la fila de totales
    TableRow separador_totales = new TableRow(this);
    separador_totales.setLayoutParams(new TableLayout.LayoutParams(
       LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
    FrameLayout linea_totales = new FrameLayout(this);
    TableRow.LayoutParams linea_totales_params =
       new TableRow.LayoutParams(LayoutParams.FILL_PARENT, 2);
    linea_totales_params.span = 6;
    linea_totales.setBackgroundColor(Color.parseColor("#FFFFFF"));
    separador_totales.addView(linea_totales, linea_totales_params);
    tabla.addView(separador_totales);
 
    // Fila de totales
    TableRow totales = new TableRow(this);
    totales.setLayoutParams(new TableLayout.LayoutParams(
       LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
 
    TextView texto_total = new TextView(this);
    TableRow.LayoutParams texto_total_params =
       new TableRow.LayoutParams(
          LayoutParams.WRAP_CONTENT,
          LayoutParams.WRAP_CONTENT);
    texto_total_params.span = 2;
    texto_total.setText("Total");
    texto_total.setTextColor(Color.parseColor("#0000CC"));
    texto_total.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
    texto_total.setGravity(Gravity.RIGHT);
    totales.addView(texto_total, texto_total_params);
 
    for (int i = 0; i < 3; i++)
    {
       TextView columna = new TextView(this);
       columna.setLayoutParams(new TableRow.LayoutParams(
          LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
       columna.setText(String.valueOf(valores_totales[i]));
       columna.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);
       columna.setGravity(Gravity.CENTER);
       totales.addView(columna);
    }
 
    tabla.addView(totales);
 
    // Añadimos la tabla a la actividad
    setContentView(tabla);
}
