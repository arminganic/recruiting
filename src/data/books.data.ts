import { subWeeks } from 'date-fns'
import { customers } from './customers.data'

export const books = [
  {
    title: 'Do Androids Dream of Electric Sheep?',
    lendTo: customers[3],
    lendAt: subWeeks(new Date(), 1),
  },
  {
    title: 'Everything I Never Told You',
    lendTo: undefined,
    lendAt: undefined,
  },
  {
    title: "Are you there, Vodka? It's Me, Chelsea",
    lendTo: customers[3],
    lendAt: subWeeks(new Date(), 5),
  },
  {
    title: 'The Devil Wears Prada',
    lendTo: customers[2],
    lendAt: subWeeks(new Date(), 10),
  },
  {
    title: 'The Curious Incident of the Dog in the Night-Time',
    lendTo: undefined,
    lendAt: undefined,
  },
]
